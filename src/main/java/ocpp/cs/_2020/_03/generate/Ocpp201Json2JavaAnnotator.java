package ocpp.cs._2020._03.generate;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import ocpp.JodaDateTimeConverter;
import org.jsonschema2pojo.AbstractAnnotator;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Ocpp201Json2JavaAnnotator extends AbstractAnnotator {

    @Override
    public void dateTimeField(JFieldVar field, JDefinedClass clazz, JsonNode node) {
        super.dateTimeField(field, clazz, node);
        field.annotate(XmlJavaTypeAdapter.class).param("value", JodaDateTimeConverter.class);
    }
}
