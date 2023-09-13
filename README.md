# scala2-13-12-issue

this compile issue can be fixed by:
- removing `context-applied` plugin *OR*
- adding explicit type `:X[(A, B)]` to `derive` function *OR*
- setting `scalaVersion := "2.13.11"`
