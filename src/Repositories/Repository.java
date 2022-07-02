package Repositories;

import java.util.List;

public interface Repository<T1> {
    void Create(T1 model);
    void Update(T1 model);
    void Delete(T1 model);
    List<T1> GetAll();
    T1 getById(int id);
}