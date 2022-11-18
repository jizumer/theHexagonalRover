package org.bcnjug.infrastructure.repositories;

import org.bcnjug.domain.PositionDirection;

public interface PositionDirectionRepositoryContract {

    void saveAndRetrievePositionDirection(PositionDirection positionDirection);
}