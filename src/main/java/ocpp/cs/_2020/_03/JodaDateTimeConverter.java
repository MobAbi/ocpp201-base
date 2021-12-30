package ocpp.cs._2020._03;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Joda-Time and XSD represent data and time information according to ISO 8601.
 */
public class JodaDateTimeConverter extends XmlAdapter<String, DateTime> {

    @Override
    public DateTime unmarshal(String v) throws Exception {
        if (isNullOrEmpty(v)) {
            return null;
        } else {
            return new DateTime(v);
        }
    }

    @Override
    public String marshal(DateTime v) throws Exception {
        if (v == null) {
            return null;
        } else {
            return v.toString();
        }
    }

    /**
     * Because I did not want to include Guava or similar only for this.
     */
    private static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }
}