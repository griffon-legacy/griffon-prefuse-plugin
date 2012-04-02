/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class PrefuseGriffonPlugin {
    // the plugin version
    String version = '0.2'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-prefuse-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Graph visualizations with Prefuse'
    String description = '''
Graph/Tree visualizations via [Prefuse][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*        | *Property* | *Type*  | *Bindable* | *Notes*                    |
| ------------- | ---------- | ------- | ---------- | -------------------------- |
| display       | drag       | boolean | no         | may be a `DragControl` too |
|               | pan        | boolean | no         | may be a `PanControl` too  |
|               | zoom       | boolean | no         | may be a `ZoomControl` too |
| visualization |            |         |            |                            |
| graph         |            |         |            |                            |
| tree          |            |         |            |                            |
| table      |            |         |            |                            |

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
'''
}
