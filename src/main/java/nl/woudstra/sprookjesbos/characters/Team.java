package nl.woudstra.sprookjesbos.characters;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bouke on 13-5-17.
 */
public class Team {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character){
        characters.add(character);
    }

    public List<Character> getCharacters(){
        return characters;
    }

    public Character getCharacter(String name){
        for(Character character : characters){
            if(character.getName().equals(name)){
                return character;
            }
        }
        return null;
    }
}
