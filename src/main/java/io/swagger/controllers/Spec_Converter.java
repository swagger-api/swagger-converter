package io.swagger.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import io.swagger.parser.OpenAPIParser;
import io.swagger.parser.models.SwaggerParseResult;

import javax.ws.rs.core.Response.Status;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2017-04-07T14:38:28.915Z")
public class Spec_Converter {
    public ResponseContext convert(RequestContext request, JsonNode inputSpec, String url) {
        System.out.println(inputSpec);
        System.out.print(url);
        if(inputSpec == null && url == null) {
            return new ResponseContext()
                    .status(Status.BAD_REQUEST)
                    .entity( "No specification supplied in either the url or request body.  Try again?" );
        }
        if(inputSpec != null) {
            String inputAsString = inputSpec.toString();
            SwaggerParseResult output = new OpenAPIParser().readContents(inputAsString, null, null);
            if(output == null) {
                return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Failed to process URL" );
            }
            if(output.getOpenAPI() == null) {
                return new ResponseContext().status(Status.BAD_REQUEST).entity(output.getMessages());
            }
            return new ResponseContext()
                    .entity(output.getOpenAPI());
        }
        if(url != null) {
            SwaggerParseResult output = new OpenAPIParser().readLocation(url, null, null);
            if(output == null) {
                return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Failed to process URL" );
            }
            if(output.getOpenAPI() == null) {
                return new ResponseContext().status(Status.BAD_REQUEST).entity(output.getMessages());
            }
            return new ResponseContext()
                    .entity(output.getOpenAPI());
        }

        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
}

