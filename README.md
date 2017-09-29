# spring-rest-docs
How to configure project having rest controller to generate docs

add src/docs/asciidoc/index.adoc

add test/java/de/be/aff/springrestdocs/DocumentationConfig

change build.gradle file accordingly (add lines marked 'neccesary')

Create actual test controller class based on example

Run bootRun gradle task and open this link in browser http://localhost:8080/docs/index.html

