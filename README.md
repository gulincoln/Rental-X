# Rental-x

git config --global --add https.proxy https://username:password@lnx237in.sjk.emb:9090
git config --global --add http.proxy http://username:password@lnx237in.sjk.emb:9090
obs: substituir '@' por '%40'

git clone [URL projeto]
cd [diretorio]

git pull origin master


-----------------------------------------------------------------------------------------
Principais comandos:

- Escolher o diretório

- git init ( inicializa o repositorio no diretorio local)

- git status 	( Verifica o estado atual do seu projeto ou se foi adicionado alguma coisa no diretorio)

- git add <file> ( Adiciona o arquivo na 'staging area')

- git add --all	( Adiciona todos os arquivos novos/alterados na staged area)

- git status ( Verifica o estado atual)

- git commit -m "Explicação" ( O 'commit' move as alterações do 'staging area' para o repositorio)

- git log ( Mostra todos as alterações feitas atraves dos commits)

- git remote add origin git@github.com:<SuaConta>/<nome_projeto>.git ( Adicionado um repositorio remoto para salvar e compartilhar o projeto)

- git remote set-url origin https://github.com/gulincoln/Rental-x.git	(renomear a url caso coloque alguma url errada no comando anterior)

- git push -u origin master ( Salva as alterações feitas locais no repositorio remoto do github) 

- git pull origin master ( Baixa os commits e alterações feitas por outros no repositorio)

- git diff HEAD		( Verifica as differenças de seu ultimo commit)

( Staged files são arquivos prontos para serem commitados)

- git add <file>		

- git diff --staged	( Mostra as diferenças para os arquivos que acabaram de ser adicionados )

- git reset <file>	( Unstage marca os arquivos que não estão mais prontos ou em uso)

- git checkout -- <file>	( Volta ao estado anterior as ultimas mudanças)

- git branch clean_up	( Faz uma cópia / 'branch' do codigo para fazer commit's separados dos demais programadores. Temos o master e uma copia chamada clean_up, que podem ser juntados depois )

- git checkout <branch> 	( move-se entre os branchs ) 
 
- git rm '*.java'		( Remove todos os arquivos .java do branch atual ) 

- git commit -m "Arquivos bugados removidos" ( Commita as alterações realizadas no branch atual )

-	git checkout master	( Volta ao branch principal 'master')

- git merge clean_up	( junta/merge as alterações feitas no branch 'clean_up' com o 'master' )

- git branch -d clean_up	( Apaga o branch 'clean_up' pois não é mais necessários apos o merge com o master)

- git push		( Por fim salva todas as alterações para o repositorio remoto )
