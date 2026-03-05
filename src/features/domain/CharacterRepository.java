package features.domain;

public interface CharacterRepository {

    void SaveCharacter(Character character);
    void DeleteCharacter(String characterId);

}
