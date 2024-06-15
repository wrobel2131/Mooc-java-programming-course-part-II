/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public enum Gender {
    MALE("male"),
    FEMALE("female");
    
    private final String gender;
    
    Gender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public static Gender fromString(String genderStr) {
        if (genderStr != null) {
            for (Gender g : Gender.values()) {
                if (g.getGender().equalsIgnoreCase(genderStr)) {
                    return g;
                }
            }
        }
        throw new IllegalArgumentException("Unknown gender: " + genderStr);
    }
}
