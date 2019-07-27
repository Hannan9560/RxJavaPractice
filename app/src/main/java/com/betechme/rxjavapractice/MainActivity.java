package com.betechme.rxjavapractice;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import com.betechme.rxjavapractice.models.Task;
import com.betechme.rxjavapractice.util.DataSource;
import com.jakewharton.rxbinding3.view.RxView;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import kotlin.Unit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    // Ui
    private SearchView searchView;

    // vars
    private CompositeDisposable disposable = new CompositeDisposable();
    private long timeSinceLastRequest; // for long printouts only. Not part of logic


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ui
        searchView = findViewById(R.id.search_view);


        /*fromPublisher*/
//        MainViewModel viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
//        viewModel.makeQuery().observe(this, new Observer<ResponseBody>() {
//            @Override
//            public void onChanged(@Nullable ResponseBody responseBody) {
//                Log.d(TAG, "onChanged: this is a live data response!");
//
//                try {
//                    Log.d(TAG, "onChanged: " + responseBody.string());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });


//        Observable<Task> taskObservable = Observable
//                .fromIterable(DataSource.createTaskList())
//                .subscribeOn(Schedulers.io())
//                .filter(new Predicate<Task>() {
//                    @Override
//                    public boolean test(Task task) throws Exception {
//                        Log.d(TAG, "test: " + Thread.currentThread().getName());
//                        return task.isComplete();
//                    }
//                })
//                .observeOn(AndroidSchedulers.mainThread());
//
//        taskObservable.subscribe(new Observer<Task>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//                Log.d(TAG, "onSubscribe: called.");
//                disposable.add(d);
//            }
//
//            @Override
//            public void onNext(Task task) {
//                Log.d(TAG, "onNext: " + Thread.currentThread().getName());
//                Log.d(TAG, "onNext: " + task.getDescription());
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.d(TAG, "onError: ", e);
//            }
//
//            @Override
//            public void onComplete() {
//                Log.d(TAG, "onComplete: called.");
//            }
//        });
//
//
//        disposable.add(taskObservable.subscribe(new Consumer<Task>() {
//            @Override
//            public void accept(Task task) throws Exception {
//
//            }
//        }));


        /*Create Operator*/
        //final  Task task = new Task("Walk the dog", false, 3);

//        Observable<Task> taskObservable = Observable
//                .create(new ObservableOnSubscribe<Task>() {
//                    @Override
//                    public void subscribe(ObservableEmitter<Task> emitter) throws Exception {
//
//                        for(Task task: DataSource.createTaskList()){
//                            if(!emitter.isDisposed()){
//                                emitter.onNext(task);
//                            }
//                        }
//                        if(!emitter.isDisposed()){
//                            emitter.onComplete();
//                        }
//
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        taskObservable.subscribe(new Observer<Task>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Task task) {
//                Log.d(TAG, "onNext: " + task.getDescription());
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*Range*/
//        Observable<Integer> observable = Observable
//                .range(0, 10)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new Observer<Integer>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Integer integer) {
//                Log.d(TAG, "onNext: " + integer);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*Map*/
//        Observable<Task> observable = Observable
//                .range(0, 10)
//                .subscribeOn(Schedulers.io())
//                .map(new Function<Integer, Task>() {
//                    @Override
//                    public Task apply(Integer integer) throws Exception {
//                        Log.d(TAG, "apply: " + Thread.currentThread().getName());
//                        return new Task("this is a task with priority: "+String.valueOf(integer), false, integer);
//                    }
//                })
//                .takeWhile(new Predicate<Task>() {
//                    @Override
//                    public boolean test(Task task) throws Exception {
//                        return task.getPriority() < 9;
//                    }
//                })
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new Observer<Task>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Task task) {
//                Log.d(TAG, "onNext: "+task.getPriority());
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*repeat*/
//        Observable<Integer> observable = Observable
//                .range(0, 3)
//                .subscribeOn(Schedulers.io())
//                .repeat(3)
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new Observer<Integer>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Integer integer) {
//                Log.d(TAG, "onNext: " + integer);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*interval*/
//        Observable<Long> intervalObservable = Observable
//                .interval(1, TimeUnit.SECONDS)
//                .subscribeOn(Schedulers.io())
//                .takeWhile(new Predicate<Long>() {
//                    @Override
//                    public boolean test(Long aLong) throws Exception {
//                        Log.d(TAG, "test: " + aLong + ", thread: " + Thread.currentThread().getName());
//                        return aLong < 5;
//                    }
//                })
//                .observeOn(AndroidSchedulers.mainThread());
//
//        intervalObservable.subscribe(new Observer<Long>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Long aLong) {
//                Log.d(TAG, "onNext: " + aLong);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*time operator*/
//        Observable<Long> timeObservable = Observable
//                .timer(3, TimeUnit.SECONDS)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        timeObservable.subscribe(new Observer<Long>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Long aLong) {
//                Log.d(TAG, "onNext: "+aLong);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*fromArray*/
//        Task[] list = new Task[5];
//        list[0] = new Task("Hello", true, 1);
//        list[1] = new Task("Hello", true, 1);
//        list[2] = new Task("Hello", true, 1);
//        list[3] = new Task("Hello", true, 1);
//        list[4] = new Task("Hello", true, 1);
//
//        Observable<Task>  observable= Observable
//                .fromArray(list)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new Observer<Task>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Task task) {
//                Log.d(TAG, "onNext: " + task.getDescription());
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*Iterable */
//        Observable<Task> observable = Observable
//                .fromIterable(DataSource.createTaskList())
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new Observer<Task>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Task task) {
//                Log.d(TAG, "onNext: " + task.getDescription());
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*Filter Operator*/
//        Observable<Task> observable = Observable
//                .fromIterable(DataSource.createTaskList())
//                .filter(new Predicate<Task>() {
//                    @Override
//                    public boolean test(Task task) throws Exception {
//                        return task.isComplete();
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new Observer<Task>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Task task) {
//                Log.d(TAG, "onNext: " + task.getDescription());
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*Distinct Operator*/
//        Observable<Task> observable = Observable
//                .fromIterable(DataSource.createTaskList())
//                .distinct(new Function<Task, String>() {
//                    @Override
//                    public String apply(Task task) throws Exception {
//                        return task.getDescription();
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());

        /*Take and takeWhile*/
//        Observable<Task> observable = Observable
//                .fromIterable(DataSource.createTaskList())
//                .takeWhile(new Predicate<Task>() {
//                    @Override
//                    public boolean test(Task task) throws Exception {
//                        return task.isComplete();
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new Observer<Task>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Task task) {
//                Log.d(TAG, "onNext: " + task.getDescription());
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });


        /*Mapping (Task -> String)*/
//        Observable<String> extractDescriptionObservable = Observable
//                .fromIterable(DataSource.createTaskList())
//                .subscribeOn(Schedulers.io())
//                .map(extractDescriptionFunction)
//                .observeOn(AndroidSchedulers.mainThread());
//
//        extractDescriptionObservable.subscribe(new Observer<String>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(String s) {
//                Log.d(TAG, "onNext: extrackted description: " + s);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        /*Mapping (Task -> Updated Task)*/

//        Observable<Task> completeTaskObservable = Observable
//                .fromIterable(DataSource.createTaskList())
//                .subscribeOn(Schedulers.io())
//                .map(completedTaskFunction)
//                .observeOn(AndroidSchedulers.mainThread());
//
//        completeTaskObservable.subscribe(new Observer<Task>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//            }
//            @Override
//            public void onNext(Task task) {
//                Log.d(TAG, "onNext: is this task complete? " + task.isComplete());
//            }
//            @Override
//            public void onError(Throwable e) {
//            }
//            @Override
//            public void onComplete() {
//            }
//        });

        /*Buffer Operator*/

//        Observable<Task> taskObservable =
//                Observable.fromIterable(DataSource.createTaskList())
//                .subscribeOn(Schedulers.io());
//
//        taskObservable.buffer(2)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<List<Task>>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(List<Task> tasks) {
//                        Log.d(TAG, "onNext: bundle results: ---------");
//                        for(Task task: tasks){
//                            Log.d(TAG, "onNext: " + task.getDescription());
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });


        /*Tracking UI Interactions*/
//        RxView.clicks(findViewById(R.id.button))
//                .map(new Function<Unit, Integer>() {
//                    @Override
//                    public Integer apply(Unit unit) throws Exception {
//                        return 1;
//                    }
//                })
//                .buffer(4, TimeUnit.SECONDS)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<List<Integer>>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        disposable.add(d);
//                    }
//
//                    @Override
//                    public void onNext(List<Integer> integers) {
//                        Log.d(TAG, "onNext: You clicked " + integers.size() + " times in 4 seconds");
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });


        /*Debounce Operator*/

        timeSinceLastRequest = System.currentTimeMillis();

        // create the Observable
        Observable<String> observableQueryText = Observable
                .create(new ObservableOnSubscribe<String>() {
                    @Override
                    public void subscribe(final ObservableEmitter<String> emitter) throws Exception {

                        // Listen for text input into the SearchView
                        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                            @Override
                            public boolean onQueryTextSubmit(String query) {
                                return false;
                            }

                            @Override
                            public boolean onQueryTextChange(final String newText) {
                                if(!emitter.isDisposed()){
                                    emitter.onNext(newText); // Pass the query to the emitter
                                }
                                return false;
                            }
                        });
                    }
                })
                .debounce(500, TimeUnit.MILLISECONDS) // Apply Debounce() operator to limit requests
                .subscribeOn(Schedulers.io());

        // Subscribe an Observer
        observableQueryText.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                disposable.add(d);
            }
            @Override
            public void onNext(String s) {
                Log.d(TAG, "onNext: time  since last request: " + (System.currentTimeMillis() - timeSinceLastRequest));
                Log.d(TAG, "onNext: search query: " + s);
                timeSinceLastRequest = System.currentTimeMillis();

                // method for sending a request to the server
                sendRequestToServer(s);
            }
            @Override
            public void onError(Throwable e) {
            }
            @Override
            public void onComplete() {
            }
        });












    }

    private void sendRequestToServer(String s) {
//        Implementing....
    }

    Function<Task, Task> completedTaskFunction = new Function<Task, Task>() {
        @Override
        public Task apply(Task task) throws Exception {
            Log.d(TAG, "apply: doing work on thread: " + Thread.currentThread().getName());
            task.setComplete(true);
            return task;
            
            
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        disposable.clear();
    }
}
