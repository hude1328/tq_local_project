package com.local.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Model {
    private int property1;
    private String property2;
    private boolean property3;


    public static class ModelBuilder {
        public static Model create(int property1, String property2, boolean property3) {
            return new Model(property1, property2, property3);
        }
    }
}
