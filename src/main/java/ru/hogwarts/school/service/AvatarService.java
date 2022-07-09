package ru.hogwarts.school.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.hogwarts.school.model.Avatar;

import java.io.IOException;
import java.util.List;

@Service
public interface AvatarService {
    void uploadAvatar ( Long studentId, MultipartFile avatarFile ) throws IOException;

    Avatar findAvatar ( Long id );

    List<Avatar> getAllAvatars ( Integer pageNumber, Integer pageSize );
}
