# Git Merge Conflict Resolution Lab

## Objective
Demonstrate how to resolve merge conflicts in Git.

---

## Step 1: Verify master/main is in a clean state

```bash
git status
```

---

## Step 2: Create a new branch

```bash
git branch GitWork
git checkout GitWork
```

---

## Step 3: Create hello.xml

```bash
echo "<message>Hello from GitWork Branch</message>" > hello.xml
```

---

## Step 4: Check status

```bash
git status
```

---

## Step 5: Commit changes

```bash
git add hello.xml
git commit -m "Added hello.xml in GitWork"
```

---

## Step 6: Switch to master/main

```bash
git checkout main
```

---

## Step 7: Create hello.xml with different content

```bash
echo "<message>Hello from Main Branch</message>" > hello.xml
```

---

## Step 8: Commit the changes

```bash
git add hello.xml
git commit -m "Added hello.xml in main"
```

---

## Step 9: View log

```bash
git log --oneline --graph --decorate --all
```

---

## Step 10: Compare differences

```bash
git diff main GitWork
```

---

## Step 11: View visual differences (P4Merge)

```bash
git difftool main GitWork
```

---

## Step 12: Merge the branch

```bash
git merge GitWork
```

Git will report a merge conflict.

---

## Step 13: Resolve the conflict

Edit **hello.xml** and remove the conflict markers.

Final content:

```xml
<message>Hello from Main Branch</message>
<message>Hello from GitWork Branch</message>
```

---

## Step 14: Commit the resolved conflict

```bash
git add hello.xml
git commit -m "Resolved merge conflict"
```

---

## Step 15: Ignore backup files

Create or update **.gitignore**

```text
*.bak
```

Commit:

```bash
git add .gitignore
git commit -m "Updated .gitignore"
```

---

## Step 16: List branches

```bash
git branch
```

---

## Step 17: Delete merged branch

```bash
git branch -d GitWork
```

---

## Step 18: View final log

```bash
git log --oneline --graph --decorate
```
