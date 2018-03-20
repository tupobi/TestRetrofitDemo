package com.example.testretrofit2;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et)
    TextInputEditText mEt;
    @BindView(R.id.textInputLayout)
    TextInputLayout mTextInputLayout;
    @BindView(R.id.btn)
    Button mBtn;
    @BindView(R.id.tv)
    TextView mTv;

    private Retrofit retrofit;
    private ITranslationBiz translationBiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.jisuapi.com/chengyu/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        translationBiz = retrofit.create(ITranslationBiz.class);
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
//        TestRetrofitGet();
//        TestRetrofitGetByQueryMap();
        TestRetrofitPost();
    }

    private void TestRetrofitPost() {
        Map<String, String> queryOptions = new HashMap<>();
        queryOptions.put("appkey", "b26bb56628f89b47");
        queryOptions.put("chengyu", mEt.getText().toString().trim());
        Call<Translation> call = translationBiz.getTranslationByPost(
                "detail",
                queryOptions);

        call.enqueue(new Callback<Translation>() {
            @Override
            public void onResponse(Call<Translation> call, Response<Translation> response) {
                Translation translation = response.body();
                if (translation == null) {
                    return;
                }
                String result = "成语名称:" + translation.getResult().getName() + "\n"
                        + "读音:" + translation.getResult().getPronounce() + "\n"
                        + "解释:" + translation.getResult().getContent() + "\n"
                        + "出自:" + translation.getResult().getComefrom() + "\n"
                        + "反义词:" + translation.getResult().getAntonym() + "\n"
                        + "近义词:" + translation.getResult().getThesaurus() + "\n"
                        + "例子:" + translation.getResult().getExample() + "n\";";

                mTv.setText(result);
            }

            @Override
            public void onFailure(Call<Translation> call, Throwable t) {
                mTv.setText(t.getMessage());
            }
        });
    }

    private void TestRetrofitGetByQueryMap() {
        Map<String, String> queryOptions = new HashMap<>();
        queryOptions.put("appkey", "b26bb56628f89b47");
        queryOptions.put("chengyu", mEt.getText().toString().trim());
        Call<Translation> call = translationBiz.getTranslationByQueryMap(
                "detail",
                queryOptions);

        call.enqueue(new Callback<Translation>() {
            @Override
            public void onResponse(Call<Translation> call, Response<Translation> response) {
                Translation translation = response.body();
                if (translation == null) {
                    return;
                }
                String result = "成语名称:" + translation.getResult().getName() + "\n"
                        + "读音:" + translation.getResult().getPronounce() + "\n"
                        + "解释:" + translation.getResult().getContent() + "\n"
                        + "出自:" + translation.getResult().getComefrom() + "\n"
                        + "反义词:" + translation.getResult().getAntonym() + "\n"
                        + "近义词:" + translation.getResult().getThesaurus() + "\n"
                        + "例子:" + translation.getResult().getExample() + "n\";";

                mTv.setText(result);
            }

            @Override
            public void onFailure(Call<Translation> call, Throwable t) {
                mTv.setText(t.getMessage());
            }
        });

    }

    private void TestRetrofitGet() {
        Call<Translation> call = translationBiz.getTranslation(
                "detail",
                "b26bb56628f89b47",
                mEt.getText().toString().trim());

        call.enqueue(new Callback<Translation>() {
            @Override
            public void onResponse(Call<Translation> call, Response<Translation> response) {
                Translation translation = response.body();
                if (translation == null) {
                    return;
                }
                String result = "成语名称:" + translation.getResult().getName() + "\n"
                        + "读音:" + translation.getResult().getPronounce() + "\n"
                        + "解释:" + translation.getResult().getContent() + "\n"
                        + "出自:" + translation.getResult().getComefrom() + "\n"
                        + "反义词:" + translation.getResult().getAntonym() + "\n"
                        + "近义词:" + translation.getResult().getThesaurus() + "\n"
                        + "例子:" + translation.getResult().getExample() + "n\";";

                mTv.setText(result);
            }

            @Override
            public void onFailure(Call<Translation> call, Throwable t) {
                mTv.setText(t.getMessage());
            }
        });
    }
}
