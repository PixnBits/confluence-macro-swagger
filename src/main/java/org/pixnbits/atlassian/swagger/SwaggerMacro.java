package org.pixnbits.atlassian.swagger;

import java.util.Map;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;
import com.atlassian.confluence.macro.Macro.BodyType;
import com.atlassian.confluence.macro.Macro.OutputType;
import com.atlassian.renderer.v2.components.HtmlEscaper;

public class SwaggerMacro implements Macro {

	public SwaggerMacro() {
	}

	@Override
	public String execute(Map<String, String> parameters, String bodyContent, ConversionContext conversionContext)
			throws MacroExecutionException {
		// TODO: convert swagger JSON/YAML to html
		// return "Swagger Macro area";
		return HtmlEscaper.escapeAll("Swagger <all> the things", false);
	}

	@Override
	public BodyType getBodyType() {
		return BodyType.NONE;
	}

	@Override
	public OutputType getOutputType() {
		return OutputType.BLOCK;
	}

}
