# DaggerKspIssueRepro

Reproduce the issue filed in https://github.com/google/dagger/issues/4181

Whenever I edit `MainActivity.kt`, KSP raises this error with first build: But second build succeeds.
```
> Task :app:kspDebugKotlin FAILED
e: [ksp] ComponentProcessingStep was unable to process 'dev.alpaca0984.daggerkspissuerepro.di.ActivityComponent' because 'dev.alpaca0984.daggerkspissuerepro.di.FragmentModule_Fragment1' could not be resolved.

Dependency trace:
    => 

If type 'dev.alpaca0984.daggerkspissuerepro.di.FragmentModule_Fragment1' is a generated type, check above for compilation errors that may have prevented the type from being generated. Otherwise, ensure that type 'dev.alpaca0984.daggerkspissuerepro.di.FragmentModule_Fragment1' is on your classpath.
e: Error occurred in KSP, check log for detail

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:kspDebugKotlin'.
> A failure occurred while executing org.jetbrains.kotlin.compilerRunner.GradleCompilerRunnerWithWorkers$GradleKotlinCompilerWorkAction
   > Compilation error. See log for more details
```

I use `Android Studio Hedgehog | 2023.1.1 Patch 1`.

![image](https://github.com/alpaca0984/DaggerKspIssueRepro/assets/9159773/e11a70b6-0cbc-46df-963c-669e06592a64)
