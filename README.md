# DRFPaper
An API-oriented Paper fork that aims to provide developers better plugin API for adding content for Minecraft. \
Generally based on [DRF](https://github.com/maestro-denery/DRF) Project.

#### Join our [Discord](https://discord.gg/upTtNyvkNf) for support and project discussion.

## Current state
This project is currently in early alpha, and proper maven repository and infrastructure will set up later.

## Concepts
This section covers main DRFPaper concepts, for info about registries and DRF in general check [DRF](https://github.com/maestro-denery/DRF), for additional info about DRFPaper details check wiki.

### Core plugins
Core plugins are plugins which load before Minecraft's game content initialization (Registries initialization). These plugins generally exist in a same jar with a usual plugin, but their entrypoint is different and represented in a class implementing `CorePlugin` and specified in `coreplugin.json`. Generally, they act like mods, they can't be loaded later and can't be unloaded while server is running. If some exception occurs in a core plugin, a server crashes, for now this is the most sane way to avoid undefined behavior. All core plugins disable when a server is shutting down.

#### Why is it needed?
Core plugins are needed for many things, but the main reason is a modification of Minecraft's game content with a minimal amount of hacks, and also having compatibility with usual bukkit plugins. Core plugins have their own, small, but powerful API elements. And also they can normally use [DRF](https://github.com/maestro-denery/DRF) implementation in DRFPaper.

### Lifecycles
Lifecycles are events which show that the state of a server has changed. This covers different steps of server initialization, minecraft game content initialization, Bukkit API initialization, etc. For this purposes we use our own event system, mainly inspired by the design of Fabric's one, because Bukkit event system is too Bukkit API dependent.

#### TODO List:
* Better core plugin management API
* Lightweight events and Lifecycles
* Regsitry, resources, data, tags, datapacks (and other) framework (DRF) implementation.
* DRF DataAddons integration
* Documentation and Wiki
