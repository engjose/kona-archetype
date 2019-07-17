# kona-archetype
基于springboot的脚手架工程,自动帮我们生成springboot项目, 当然你也可以根据这个脚手架改成符合自己的项目结构的脚手架, 这个脚手架生成的项目仅仅是符合
之前我们定义的项目结构 https://github.com/engjose/kona-framework

# 如何运行
- 将脚手架工程clone到本地, 打包编译 mvn clean install
- 运行 mvn archetype:crawl
- 然后运行命令mvn archetype:generate -DarchetypeCatalog=local 然后按照提示选择刚才的脚手架, 输入groupId, artifactId, version && package
就生成我们的脚手架项目
