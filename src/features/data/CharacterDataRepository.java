package features.data;

import features.domain.SaveCharacterUseCase;

public class CharacterDataRepository {

    public {
        SaveCharacterUseCase saveCharacterUseCase = new SaveCharacterUseCase(
                new CharacterDataRepository(
                        CharacterMemLocalDataSource.newInstance()));

        void saveCharacterUseCase(Character character);
    }

}
