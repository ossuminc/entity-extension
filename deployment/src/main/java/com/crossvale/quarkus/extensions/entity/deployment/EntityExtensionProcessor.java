package com.crossvale.quarkus.extensions.entity.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class EntityExtensionProcessor {

    private static final String FEATURE = "Support DDD Entities";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
