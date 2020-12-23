# Git basic commands
- git status -> fatal: not a git repository (or any of the parent directories): .git
- git init -> Initialize empty git repository in project directory. (.git folder will be created in the project directory. Every changes will be reflect in this folder)
- git status
- git add . -> It will add local files to staging index
- git commit -m "Project skeleton has been added to local repository."
- git log
- <Modify in your source code>
- git status
- git commit -m "sayHi() method logic has changed."
- git log --graph --decorate --all --pretty=oneline

## Set remote repository
```git remote add origin https://github.com/varatharuban/git-intro.git```

## Push the changes to remote
- ```git push -u origin master```

### git commit => to local repository
### git push => to remote repository
