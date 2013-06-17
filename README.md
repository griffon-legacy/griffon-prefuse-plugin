
Graph visualizations with Prefuse
---------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/prefuse](http://artifacts.griffon-framework.org/plugin/prefuse)


Graph/Tree visualizations via [Prefuse][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*        | *Property* | *Type*  | *Bindable* | *Notes*                    |
| ------------- | ---------- | ------- | ---------- | -------------------------- |
| display       | drag       | boolean | no         | may be a `DragControl` too |
|               | pan        | boolean | no         | may be a `PanControl` too  |
|               | zoom       | boolean | no         | may be a `ZoomControl` too |
| visualization |            |         |            |                            |
| graph         |            |         |            |                            |
| tree          |            |         |            |                            |
| table         |            |         |            |                            |

Nodes are automatically added with `pf` as prefix, here's an example of their usage

        pfdisplay(size: [720, 500], drag: true, pan: true, zoom: true) {
            pfvisualization(id: 'visualization') {
                pfgraph(id: 'graph') {
                    current.addColumn 'name', String
                    current.addColumn 'gender', String
                }
            }
        }

Configuration
-------------

Styles and shapes can be configured by placing a `GraphConfig.groovy` inside `griffon-app/conf`. This script accepts 
two top level nodes: `shapes` and `styles`.

### Example

A port of Prefuse's [Example.java][2] can be found [here][3].

[1]: http://http//prefuse.org
[2]: http://prefuse.org/doc/manual/introduction/example/Example.java
[3]: https://github.com/aalmiray/griffon_sample_apps/tree/master/misc/prefuse

