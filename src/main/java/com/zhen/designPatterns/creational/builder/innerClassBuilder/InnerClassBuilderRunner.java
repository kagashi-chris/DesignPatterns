package com.zhen.designPatterns.creational.builder.innerClassBuilder;

public class InnerClassBuilderRunner {

    public static void main(String[] args) {
        User chris = new User.UserBuilder("chris")
                .setNewsletter(true)
                .build();
        User alex = new User.UserBuilder("ALEXXXXXXXXX")
                .setEmail("chrisisawesome@email")
                .setId(1337)
                .build();
        System.out.println(chris);
        System.out.println(alex);
    }
}
