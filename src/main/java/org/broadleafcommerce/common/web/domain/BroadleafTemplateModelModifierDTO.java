/*
 * #%L
 * broadleaf-common-thymeleaf
 * %%
 * Copyright (C) 2009 - 2016 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.common.web.domain;

import org.broadleafcommerce.common.web.dialect.AbstractBroadleafModelModifierProcessor;

import java.util.HashMap;
import java.util.Map;

/**
 * Holder object for passing around a {@link BroadleafThymeleafModel} and a Map that represents the parameters
 * that should be used when creating the tag. See {@link AbstractBroadleafModelModifierProcessor}
 * 
 * @author Jay Aisenbrey (cja769)
 *
 */
public class BroadleafTemplateModelModifierDTO {

    protected BroadleafTemplateModel model;
    protected Map<String, String> formParameters;
    protected Map<String, Object> formLocalVariables;
    protected String tagName;

    public BroadleafTemplateModelModifierDTO(BroadleafTemplateModel model, Map<String, String> formParameters, String tagName) {
        this.model = model;
        this.formParameters = formParameters;
        this.tagName = tagName;
    }
    
    public BroadleafTemplateModelModifierDTO(BroadleafTemplateModel model, Map<String, String> formParameters, Map<String, Object> formLocalVariables, String tagName) {
        this.model = model;
        this.formParameters = formParameters;
        this.formLocalVariables = formLocalVariables;
        this.tagName = tagName;
    }

    public BroadleafTemplateModelModifierDTO() {
        model = null;
        formParameters = new HashMap<>();
        formLocalVariables = new HashMap<>();
    }

    public BroadleafTemplateModel getModel() {
        return model;
    }

    public void setModel(BroadleafTemplateModel model) {
        this.model = model;
    }

    public Map<String, String> getFormParameters() {
        return formParameters;
    }

    public void setFormParameters(Map<String, String> formParameters) {
        this.formParameters = formParameters;
    }

    public Map<String, Object> getFormLocalVariables() {
        return formLocalVariables;
    }

    public void setFormLocalVariables(Map<String, Object> formLocalVariables) {
        this.formLocalVariables = formLocalVariables;
    }
    
    public String getTagName() {
        return tagName;
    }
    
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}