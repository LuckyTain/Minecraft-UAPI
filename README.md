# Minecraft - UsefulAPI
一个为了方便开发Minecraft服务端(for Spigot)插件的API。

用途/功能
--------
```
* 1 用户
  * 1.1 额外的API
  * 1.2 技能管理器
  * 1.3 GUI数据管理器
  * 1.4 自定义数据管理器 (未开工)
* 2 方块
  * 2.1 方块检查器
  * 2.2 多结构方块检查器
* 3 道具
  * 3.1 道具检查器
  * 3.2 道具创建工具
  * 3.3 NBT修改工具 (进度: 90%)
* 4 网络
  * 4.1 自定义封包发送
  * 4.2 封包拦截事件 (未开工)
* 5 NBT
  * 5.1 封装的NBT类
* 6 GUI
  * 6.1 自定义树形GUI
  * 6.2 自定义GUI类型
  * 6.3 自定义GUI/UI容器
  * 6.4 自定义渲染器
* 7 插件
  * 7.1 自定义规则
  * 7.2 自定义事件
* 8 其他工具
  * 8.1 粒子效果
  * 8.2 底层类工具
  * 8.3 颜色工具 (进度: 10%)
```

使用方法
--------
1.在您插件 plugin.yml 中的 depend 内添加 UsefulAPI。

例如:
```yml
name: MyPlugin
main: me.xxx.plugin.Main
depend: [UsefulAPI]
```

2.导入 UsefulAPI 的Jar包。

3.告诉安装者他们需要也安装上 UsefulAPI 这个插件。

例子
--------
待编辑
