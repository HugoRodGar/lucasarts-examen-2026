package features.presentation;

import features.data.CharacterDataRepository;
import features.data.CharacterMemLocalDataSource;
import features.domain.DeleteCharacterUseCase;
import features.domain.SaveCharacterUseCase;

public class CharaterView {

    public class SaveCharacter{
        SaveCharacterUseCase saveCharacterUseCase = new SaveCharacterUseCase(
                new CharacterDataRepository(
                        CharacterMemLocalDataSource.newInstance(Character)));

        void saveCharacterUseCase(Character character);
    }

    public class DeleteCharacter{
        DeleteCharacterUseCase deleteCharacterUseCase = new DeleteCharacterUseCase(
                new CharacterDataRepository(
                        CharacterMemLocalDataSource.newInstance(Character)));

        void deleteCharacterUseCase(String characterId);
    }

}
