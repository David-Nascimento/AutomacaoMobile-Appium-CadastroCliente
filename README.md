# AutomacaoMobile-Appium-CadastroCliente
Projeto de automação Mobile com Appium em Java. Automação de teste do app de cadastro de cliente.

### Pré-requisito

<ul>
    <li>Ter o appiumServer instalado e rodando, nesse projeto utilizei a versão 1.15.1. O download está [disponível aqui:](https://github.com/appium/appium-desktop/releases/tag/v1.13.0);</li>
    <li>Possuir um simulador android, pode ser instalado o AndroidStudio e através dele criar e executar o simulador pelo AVD Manager; </li>
    <li>Baixar e instalar JDK (JAVA Development Kit);</li>
    <li>IDE de sua preferência, utilizei o eclipse;</li>
    <li>Configurar variáveis de ambiente para o Java.</li>
    <li>Configurar variáveis de ambiente para o Android.</li>
  </ul>
  
  #### Configurar variáveis de ambiente para o Java
  Para isso, siga os passos abaixo:
1. Acessar Propriedades do Sistema > Configurações avançadas do sistema > Variáveis de ambiente >> Variáveis de usuário >> Novo.
2. Insira o nome da variável como "JAVA_HOME" e insira como valor a localização exata do seu arquivo jre, por exemplo, "C:\Arquivos de Programa\Java\jdk1.8\jre".
3. Na seção de variáveis de sistema, dê um clique duplo em "Path" e adicione a expressão "%JAVA_HOME%\bin". Isto significa que você está adicionando o mesmo valor criado para JAVA_HOME, só que também para a pasta \bin.
4. É só clicar OK e aplicar as mudanças de configuração.

#### Configurar variáveis de ambiente para o Android
  Para isso, siga os passos abaixo: 
1. Siga o mesmo passo #1 descrito acima até alcançar o campo de variáveis de ambiente.
2. Agora, insira o nome da variável como "ANDROID_HOME" e insira como valor a localização exata onde seu Android SDK foi instalado, por exemplo, "C:\android-sdk".
3. Agora, mais uma vez precisamos adicionar o valor da sua nova variável à sua variável global do sistema, que é o Path: "%ANDROID_HOME%\platform-tools", "%ANDROID_HOME%\tools\bin" e também "%ANDROID_HOME&\tools".
4. É só clicar OK e aplicar as mudanças de configuração.
