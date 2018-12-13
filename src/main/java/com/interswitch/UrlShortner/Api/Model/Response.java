package com.interswitch.UrlShortner.Api.Model;

import java.util.List;

public class Response {

    private final String code;
    private final String description;
    private final String errors;

    public Response(String Code, String Description, String Errors) {
        this.code = Code;
        this.description = Description;
        this.errors = Errors;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() { return description;
    }

    public String getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", errors='" + errors + '\'' +
                '}';
    }
}
