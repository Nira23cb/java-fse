# Git Cleanup and Push to Remote Repository Lab

## Objective
Demonstrate how to clean up the local repository and push changes to the remote Git repository.

---

## Step 1: Verify master/main is in a clean state

```bash
git status
```

---

## Step 2: List all available branches

```bash
git branch
```

---

## Step 3: Pull the latest changes from the remote repository

```bash
git pull origin main
```

> If your default branch is **master**, use:

```bash
git pull origin master
```

---

## Step 4: Push local changes to the remote repository

```bash
git push origin main
```

> If using **master**, use:

```bash
git push origin master
```

---

## Step 5: Verify changes in the remote repository

Open the GitHub repository in a web browser and verify that the latest commits and files are available.

Repository:
https://github.com/Nira23cb/java-fse
