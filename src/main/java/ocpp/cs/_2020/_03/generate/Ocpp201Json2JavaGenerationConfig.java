package ocpp.cs._2020._03.generate;

import org.jsonschema2pojo.DefaultGenerationConfig;

public class Ocpp201Json2JavaGenerationConfig extends DefaultGenerationConfig {

    @Override
    public boolean isIncludeGeneratedAnnotation() {
        return false;
    }

    @Override
    public boolean isSerializable() {
        return true;
    }

    @Override
    public boolean isUseJodaDates() {
        return true;
    }
}
