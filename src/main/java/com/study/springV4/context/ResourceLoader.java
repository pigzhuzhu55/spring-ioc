package com.study.springV4.context;

import java.io.IOException;

public interface ResourceLoader {

    Resource getResource(String location) throws IOException;

}
