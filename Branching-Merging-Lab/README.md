# Git Branching and Merging Lab

## Objectives
- Explain branching and merging.
- Create a new branch.
- Switch between branches.
- Commit changes in a branch.
- Merge the branch with the master/main branch.
- Delete the merged branch.

## Branching Commands

### Create a new branch
```bash
git branch GitNewBranch
```

### List all branches
```bash
git branch -a
```

### Switch to the new branch
```bash
git checkout GitNewBranch
```

### Create a file
```bash
echo This file is created in GitNewBranch > BranchFile.txt
```

### Add the file
```bash
git add BranchFile.txt
```

### Commit the changes
```bash
git commit -m "Added BranchFile"
```

### Check repository status
```bash
git status
```

## Merging Commands

### Switch to master/main
```bash
git checkout main
```

### Compare branches
```bash
git diff main GitNewBranch
```

### View visual differences (P4Merge)
```bash
git difftool main GitNewBranch
```

### Merge the branch
```bash
git merge GitNewBranch
```

### View commit history
```bash
git log --oneline --graph --decorate
```

### Delete the branch
```bash
git branch -d GitNewBranch
```

### Check repository status
```bash
git status
```
