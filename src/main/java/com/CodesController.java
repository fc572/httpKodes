package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodesController {

    private static final String template = "The code number %s means %s";

    @RequestMapping("/codes")
    public Codes codes(@RequestParam(value = "code") String code, String message) {

        switch(Integer.parseInt(code))
            {
                case 101: message = "Switching Protocols"; break;
                case 102:  message = "Processing"; break;
                case 200:  message = "OK"; break;
                case 201:  message = "Created"; break;
                case 202:  message = "Accepted"; break;
                case 203:  message = "Non-Authoritative Information"; break;
                case 204:  message = "No Content"; break;
                case 205:  message = "Reset Content"; break;
                case 206:  message = "Partial Content"; break;
                case 207:  message = "Multi-Status"; break;
                case 226:  message = "IM Used"; break;
                case 300:  message = "Multiple Choices"; break;
                case 301:  message = "Moved Permanently"; break;
                case 302:  message = "Found"; break;
                case 303:  message = "See Other"; break;
                case 304:  message = "Not Modified"; break;
                case 305:  message = "Use Proxy"; break;
                case 306:  message = "Reserved"; break;
                case 307:  message = "Temporary Redirect"; break;
                case 400:  message = "Bad Request"; break;
                case 401:  message = "Unauthorized"; break;
                case 402:  message = "Payment Required"; break;
                case 403:  message = "Forbidden"; break;
                case 404:  message = "Not Found"; break;
                case 405:  message = "Method Not Allowed"; break;
                case 406:  message = "Not Acceptable"; break;
                case 407:  message = "Proxy Authentication Required"; break;
                case 408:  message = "Request Timeout"; break;
                case 409:  message = "Conflict"; break;
                case 410:  message = "Gone"; break;
                case 411:  message = "Length Required"; break;
                case 412:  message = "Precondition Failed"; break;
                case 413:  message = "Request Entity Too Large"; break;
                case 414:  message = "Request-URI Too Long"; break;
                case 415:  message = "Unsupported Media Type"; break;
                case 416:  message = "Requested Range Not Satisfiable"; break;
                case 417:  message = "Expectation Failed"; break;
                case 422:  message = "Unprocessable Entity"; break;
                case 423:  message = "Locked"; break;
                case 424:  message = "Failed Dependency"; break;
                case 426:  message = "Upgrade Required"; break;
                case 500:  message = "Internal Server Error"; break;
                case 501:  message = "Not Implemented"; break;
                case 502:  message = "Bad Gateway"; break;
                case 503:  message = "Service Unavailable"; break;
                case 504:  message = "Gateway Timeout"; break;
                case 505:  message = "HTTP Version Not Supported"; break;
                case 506:  message = "Variant Also Negotiates"; break;
                case 507:  message = "Insufficient Storage"; break;
                case 510:  message = "Not Extended"; break;
                default:  message = "nothing as it is not present in the list of valid HTTP codes";
            }
         return new Codes(String.format(template, code, message));
    }
}