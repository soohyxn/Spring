package com.sparta.week06.repository;

import com.sparta.week06.model.Folder;
import com.sparta.week06.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
}