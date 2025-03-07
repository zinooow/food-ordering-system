plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "food-ordering-system"
include("common")
include("common:common-domain")
findProject(":common:common-domain")?.name = "common-domain"
include("order-service")
include("order-service:order-application")
findProject(":order-service:order-application")?.name = "order-application"
include("order-service:order-container")
findProject(":order-service:order-container")?.name = "order-container"
include("order-service:order-dataaccess")
findProject(":order-service:order-dataaccess")?.name = "order-dataaccess"
include("order-service:order-domain")
findProject(":order-service:order-domain")?.name = "order-domain"
include("order-service:order-domain:order-domain-core")
findProject(":order-service:order-domain:order-domain-core")?.name = "order-domain-core"
include("order-service:order-domain:order-application-service")
findProject(":order-service:order-domain:order-application-service")?.name = "order-application-service"
include("order-service:order-messaging")
findProject(":order-service:order-messaging")?.name = "order-messaging"
