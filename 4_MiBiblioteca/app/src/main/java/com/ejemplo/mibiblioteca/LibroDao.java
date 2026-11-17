package com.ejemplo.mibiblioteca;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface LibroDao {

    @Query("SELECT * FROM libros ORDER BY titulo")
    List<Libro> obtenerTodos();

    @Query("SELECT COUNT(*) FROM libros WHERE leido = 1")
    int contarLeidos();

    @Insert
    long insertar(Libro libro);

    @Update
    void actualizar(Libro libro);

    @Delete
    void eliminar(Libro libro);
}