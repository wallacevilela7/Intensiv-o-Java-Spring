package tech.wvs.dslistbackend.dto;

import tech.wvs.dslistbackend.entity.GameList;

public class GameListDto {
    private Long id;
    private String name;

    public GameListDto() {
    }

    public GameListDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public GameListDto(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
