# Quarkus Entity Extension

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.custom/quarkus-custom?logo=apache-maven&style=flat-square)](https://central.sonatype.com/artifact/io.quarkiverse.custom/quarkus-custom-parent)

## Why

This extension aims to make it much simpler to support DDD entities
in Quarkus. DDD Entities are objects that:
* have a unique identifier
* equivalence is based on the unique identifier
* process single events at a time 
* use event sourcing for their persistence
* and many other things .. tbd

## Quarkiverse Stuff

Congratulations and thank you for creating a new Quarkus extension project 
in Quarkiverse!

Feel free to replace this content with the proper description of your new
project and necessary instructions how to use and contribute to it.

You can find the basic info, Quarkiverse policies and conventions in [the Quarkiverse wiki](https://github.com/quarkiverse/quarkiverse/wiki).

In case you are creating a Quarkus extension project for the first time, please follow [Building My First Extension](https://quarkus.io/guides/building-my-first-extension) guide.

Other useful articles related to Quarkus extension development can be found under the [Writing Extensions](https://quarkus.io/guides/#writing-extensions) guide category on the [Quarkus.io](https://quarkus.io) website.

Thanks again, good luck and have fun!

## Documentation

The documentation for this extension is maintained as part of this repository, 
in the `docs/` directory.

The layout follows the [Antora's Standard File and Directory Set](https://docs.antora.org/antora/2.3/standard-directories/).

Once the docs are ready to be published, please open a PR including this repository in the [Quarkiverse Docs Antora playbook](https://github.com/quarkiverse/quarkiverse-docs/blob/main/antora-playbook.yml#L7). See an example [here](https://github.com/quarkiverse/quarkiverse-docs/pull/1)

Your documentation will then be published to the <https://docs.quarkiverse.io/> website.
