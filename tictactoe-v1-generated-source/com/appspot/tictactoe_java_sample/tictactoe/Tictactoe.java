/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-08-03 17:34:38 UTC)
 * on 2015-10-07 at 16:12:58 UTC 
 * Modify at your own risk.
 */

package com.appspot.tictactoe_java_sample.tictactoe;

/**
 * Service definition for Tictactoe (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TictactoeRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Tictactoe extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the tictactoe library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "http://127.0.0.1:8080/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "tictactoe/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Tictactoe(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Tictactoe(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Board collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Tictactoe tictactoe = new Tictactoe(...);}
   *   {@code Tictactoe.Board.List request = tictactoe.board().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Board board() {
    return new Board();
  }

  /**
   * The "board" collection of methods.
   */
  public class Board {

    /**
     * Create a request for the method "board.getmove".
     *
     * This request holds the parameters needed by the tictactoe server.  After setting any optional
     * parameters, call the {@link Getmove#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.appspot.tictactoe_java_sample.tictactoe.model.Board}
     * @return the request
     */
    public Getmove getmove(com.appspot.tictactoe_java_sample.tictactoe.model.Board content) throws java.io.IOException {
      Getmove result = new Getmove(content);
      initialize(result);
      return result;
    }

    public class Getmove extends TictactoeRequest<com.appspot.tictactoe_java_sample.tictactoe.model.Board> {

      private static final String REST_PATH = "board";

      /**
       * Create a request for the method "board.getmove".
       *
       * This request holds the parameters needed by the the tictactoe server.  After setting any
       * optional parameters, call the {@link Getmove#execute()} method to invoke the remote operation.
       * <p> {@link
       * Getmove#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.appspot.tictactoe_java_sample.tictactoe.model.Board}
       * @since 1.13
       */
      protected Getmove(com.appspot.tictactoe_java_sample.tictactoe.model.Board content) {
        super(Tictactoe.this, "POST", REST_PATH, content, com.appspot.tictactoe_java_sample.tictactoe.model.Board.class);
      }

      @Override
      public Getmove setAlt(java.lang.String alt) {
        return (Getmove) super.setAlt(alt);
      }

      @Override
      public Getmove setFields(java.lang.String fields) {
        return (Getmove) super.setFields(fields);
      }

      @Override
      public Getmove setKey(java.lang.String key) {
        return (Getmove) super.setKey(key);
      }

      @Override
      public Getmove setOauthToken(java.lang.String oauthToken) {
        return (Getmove) super.setOauthToken(oauthToken);
      }

      @Override
      public Getmove setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Getmove) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Getmove setQuotaUser(java.lang.String quotaUser) {
        return (Getmove) super.setQuotaUser(quotaUser);
      }

      @Override
      public Getmove setUserIp(java.lang.String userIp) {
        return (Getmove) super.setUserIp(userIp);
      }

      @Override
      public Getmove set(String parameterName, Object value) {
        return (Getmove) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Scores collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Tictactoe tictactoe = new Tictactoe(...);}
   *   {@code Tictactoe.Scores.List request = tictactoe.scores().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Scores scores() {
    return new Scores();
  }

  /**
   * The "scores" collection of methods.
   */
  public class Scores {

    /**
     * Create a request for the method "scores.insert".
     *
     * This request holds the parameters needed by the tictactoe server.  After setting any optional
     * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.appspot.tictactoe_java_sample.tictactoe.model.Score}
     * @return the request
     */
    public Insert insert(com.appspot.tictactoe_java_sample.tictactoe.model.Score content) throws java.io.IOException {
      Insert result = new Insert(content);
      initialize(result);
      return result;
    }

    public class Insert extends TictactoeRequest<com.appspot.tictactoe_java_sample.tictactoe.model.Score> {

      private static final String REST_PATH = "score";

      /**
       * Create a request for the method "scores.insert".
       *
       * This request holds the parameters needed by the the tictactoe server.  After setting any
       * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
       * <p> {@link
       * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.appspot.tictactoe_java_sample.tictactoe.model.Score}
       * @since 1.13
       */
      protected Insert(com.appspot.tictactoe_java_sample.tictactoe.model.Score content) {
        super(Tictactoe.this, "POST", REST_PATH, content, com.appspot.tictactoe_java_sample.tictactoe.model.Score.class);
      }

      @Override
      public Insert setAlt(java.lang.String alt) {
        return (Insert) super.setAlt(alt);
      }

      @Override
      public Insert setFields(java.lang.String fields) {
        return (Insert) super.setFields(fields);
      }

      @Override
      public Insert setKey(java.lang.String key) {
        return (Insert) super.setKey(key);
      }

      @Override
      public Insert setOauthToken(java.lang.String oauthToken) {
        return (Insert) super.setOauthToken(oauthToken);
      }

      @Override
      public Insert setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Insert) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Insert setQuotaUser(java.lang.String quotaUser) {
        return (Insert) super.setQuotaUser(quotaUser);
      }

      @Override
      public Insert setUserIp(java.lang.String userIp) {
        return (Insert) super.setUserIp(userIp);
      }

      @Override
      public Insert set(String parameterName, Object value) {
        return (Insert) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "scores.list".
     *
     * This request holds the parameters needed by the tictactoe server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends TictactoeRequest<com.appspot.tictactoe_java_sample.tictactoe.model.ScoreCollection> {

      private static final String REST_PATH = "score";

      /**
       * Create a request for the method "scores.list".
       *
       * This request holds the parameters needed by the the tictactoe server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(Tictactoe.this, "GET", REST_PATH, null, com.appspot.tictactoe_java_sample.tictactoe.model.ScoreCollection.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String limit;

      /**

       */
      public java.lang.String getLimit() {
        return limit;
      }

      public List setLimit(java.lang.String limit) {
        this.limit = limit;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String order;

      /**

       */
      public java.lang.String getOrder() {
        return order;
      }

      public List setOrder(java.lang.String order) {
        this.order = order;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Tictactoe}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Tictactoe}. */
    @Override
    public Tictactoe build() {
      return new Tictactoe(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link TictactoeRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTictactoeRequestInitializer(
        TictactoeRequestInitializer tictactoeRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(tictactoeRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
