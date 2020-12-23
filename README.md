# stuSSM
一个简单的SSM框架


集成插件
  swagger2
    1.导入依赖
    2.编写配置类
      这里有一个很重要的注意点
      如果在项目中导入了Junit测试的依赖，即你的项目集成了junit，那么配置类的注解要使用@WebAppConfiguration
      如果没有集成Junit，配置类的注解使用@Configuration
      否则启动的时候会弹窗通知无法识别url
      实际上，我们进行代码自测，在有了swagger以后，几乎就用不到junit这样重量级的测试插件了
