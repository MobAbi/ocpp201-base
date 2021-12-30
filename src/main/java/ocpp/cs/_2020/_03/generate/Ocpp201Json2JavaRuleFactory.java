package ocpp.cs._2020._03.generate;

import com.sun.codemodel.JClassContainer;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;
import org.jsonschema2pojo.Annotator;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.Rule;
import org.jsonschema2pojo.util.ParcelableHelper;

public class Ocpp201Json2JavaRuleFactory extends org.jsonschema2pojo.rules.RuleFactory {

    private final GenerationConfig generationConfig = new Ocpp201Json2JavaGenerationConfig();

    public Ocpp201Json2JavaRuleFactory(GenerationConfig generationConfig, Annotator annotator, SchemaStore schemaStore) {
        super(generationConfig, annotator, schemaStore);
    }

    public Ocpp201Json2JavaRuleFactory() {
        super();
    }

    @Override
    public Rule<JPackage, JType> getObjectRule() {
        setGenerationConfig(generationConfig); // DAS IST NOETIG!!!
        return new Ocpp201Json2JavaObjectRule(this, new ParcelableHelper(), getReflectionHelper());
    }

    @Override
    public Rule<JClassContainer, JType> getEnumRule() {
        setGenerationConfig(generationConfig); // DAS IST NOETIG!!!
        return super.getEnumRule();
    }
}
