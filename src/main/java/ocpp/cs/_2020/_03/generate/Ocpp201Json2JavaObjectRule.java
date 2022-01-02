package ocpp.cs._2020._03.generate;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;
import ocpp.RequestType;
import ocpp.ResponseType;
import org.jsonschema2pojo.Schema;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsonschema2pojo.util.ParcelableHelper;
import org.jsonschema2pojo.util.ReflectionHelper;

public class Ocpp201Json2JavaObjectRule extends org.jsonschema2pojo.rules.ObjectRule {

    protected Ocpp201Json2JavaObjectRule(RuleFactory ruleFactory, ParcelableHelper parcelableHelper, ReflectionHelper reflectionHelper) {
        super(ruleFactory, parcelableHelper, reflectionHelper);
    }

    @Override
    public JType apply(String nodeName, JsonNode node, JsonNode parent, JPackage _package, Schema schema) {
        final JType jType = super.apply(nodeName, node, parent, _package, schema);
        if (jType instanceof JDefinedClass) {
            final JDefinedClass jDefinedClass = (JDefinedClass)jType;
            if (nodeName.endsWith("Request")) {
                jDefinedClass._implements(RequestType.class);
            } else if (nodeName.endsWith("Response")) {
                jDefinedClass._implements(ResponseType.class);
            }
        }
        return jType;
    }
}
