package ru.practicum.stats.mapper;

import dto.RequestStat;
import dto.ViewStats;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.practicum.stats.entity.StatEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-22T14:20:37+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class StatMapperImpl implements StatMapper {

    @Override
    public StatEntity toStatEntity(RequestStat requestStat) {
        if ( requestStat == null ) {
            return null;
        }

        StatEntity statEntity = new StatEntity();

        statEntity.setTimestamp( parseTimestamp( requestStat.getTimestamp() ) );
        statEntity.setApp( requestStat.getApp() );
        statEntity.setUri( requestStat.getUri() );
        statEntity.setIp( requestStat.getIp() );

        return statEntity;
    }

    @Override
    public ViewStats toResponseStat(StatEntity statEntity) {
        if ( statEntity == null ) {
            return null;
        }

        ViewStats.ViewStatsBuilder viewStats = ViewStats.builder();

        viewStats.app( statEntity.getApp() );
        viewStats.uri( statEntity.getUri() );

        return viewStats.build();
    }
}
