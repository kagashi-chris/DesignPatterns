package com.zhen.designPatterns.creational.builder.innerClassBuilder;

public class User {

    private String name;
    private int id;
    private String email;
    private boolean newsletter;

    public User() {
    }

    public User(UserBuilder userBuilder)
    {
        this.name = userBuilder.name;
        this.id = userBuilder.id;
        this.email = userBuilder.email;
        this.newsletter = userBuilder.newsletter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", newsletter=" + newsletter +
                '}';
    }

    public static class UserBuilder
    {
        //required properties
        private String name;
        //optional properties
        private int id;
        private String email;
        private boolean newsletter;

        public UserBuilder(String name) {
            this.name = name;

        }

        public UserBuilder setName(String name)
        {
            this.name = name;
            return this;
        }

        public UserBuilder setId(int id)
        {
            this.id = id;
            return this;
        }

        public UserBuilder setEmail(String email)
        {
            this.email = email;
            return this;
        }

        public UserBuilder setNewsletter(boolean newsletter)
        {
            this.newsletter = newsletter;
            return this;
        }



        public User build()
        {
            return new User(this);
        }
    }
}
