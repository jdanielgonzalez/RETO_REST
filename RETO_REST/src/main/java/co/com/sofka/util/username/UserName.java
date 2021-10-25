package co.com.sofka.util.username;

public enum UserName {
    USERNAME1("Bret"),
    USERNAME2("Antonette"),
    USERNAME3("Samantha"),
    USERNAME4("Karianne"),
    USERNAME5("Kamren"),
    USERNAME6("Leopoldo_Corkery"),
    USERNAME7("Elwyn.Skiles"),
    USERNAME8("Maxime_Nienow"),
    USERNAME9("Delphine"),
    USERNAME110("Moriah.Stanton");


    private final String value;

    public String getValue() {
        return value;
    }

    UserName(String value) {
        this.value = value;
    }
}
