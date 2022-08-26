package core.basesyntax.dao;

import core.basesyntax.model.Fruit;
import java.util.List;

public interface StorageDao {
    void update(String fruitName, Integer amount);

    Integer getAmount(String fruitName);

    List<Fruit> getAll();
}
