package com.tmb.config;

import com.tmb.config.converters.StringToBrowserTypeConvertor;
import com.tmb.config.enums.BrowserType;
import org.aeonbits.owner.Config;
import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system.properties",
        "system:env",
        "file: ${user.dir}/src/test/resources/config.properties"
})


public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConvertor.class)
    BrowserType browser();
}
