package com.aem.geeks.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class Maha {
    @ValueMapValue
    private String text;


    public String getText() {
        return text;
    }

   




}

