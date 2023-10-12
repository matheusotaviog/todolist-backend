package br.com.matheusotaviog.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tab_tasks")
public class TaskModel {

    /*
    * ID
    * USUÁRIO (ID_USUARIO)
    * DESCRIÇÃO
    * TÍTULO
    * DATA DE INÍCIO
    * DATA DE TÉRMINO
    * PRIORIDADE
    */

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String description;

    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
