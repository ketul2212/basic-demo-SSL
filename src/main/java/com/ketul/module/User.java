package com.ketul.module;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private long id;
    private String name;
    private String email;
}
