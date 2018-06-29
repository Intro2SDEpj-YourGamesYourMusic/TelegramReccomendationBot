
package recombee.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import game.soap.ws.Game;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Recombee", targetNamespace = "http://ws.recombee/")
@XmlSeeAlso({
	game.soap.ws.ObjectFactory.class,
    recombee.ws.ObjectFactory.class
})
public interface Recombee {


    /**
     * 
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "registerUser", targetNamespace = "http://ws.recombee/", className = "recombee.ws.RegisterUser")
    @ResponseWrapper(localName = "registerUserResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.RegisterUserResponse")
    @Action(input = "http://ws.recombee/Recombee/registerUserRequest", output = "http://ws.recombee/Recombee/registerUserResponse")
    public boolean registerUser(
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @param user
     * @return
     *     returns java.util.List<game.soap.ws.Game>
     */
    @WebMethod
    @WebResult(name = "games", targetNamespace = "")
    @RequestWrapper(localName = "getReccomendation", targetNamespace = "http://ws.recombee/", className = "recombee.ws.GetReccomendation")
    @ResponseWrapper(localName = "getReccomendationResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.GetReccomendationResponse")
    @Action(input = "http://ws.recombee/Recombee/getReccomendationRequest", output = "http://ws.recombee/Recombee/getReccomendationResponse")
    public List<Game> getReccomendation(
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @param genre
     * @param user
     * @return
     *     returns java.util.List<game.soap.ws.Game>
     */
    @WebMethod
    @WebResult(name = "games", targetNamespace = "")
    @RequestWrapper(localName = "getReccomendationByGenre", targetNamespace = "http://ws.recombee/", className = "recombee.ws.GetReccomendationByGenre")
    @ResponseWrapper(localName = "getReccomendationByGenreResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.GetReccomendationByGenreResponse")
    @Action(input = "http://ws.recombee/Recombee/getReccomendationByGenreRequest", output = "http://ws.recombee/Recombee/getReccomendationByGenreResponse")
    public List<Game> getReccomendationByGenre(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "genre", targetNamespace = "")
        String genre);

    /**
     * 
     * @param appId
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addPurchase", targetNamespace = "http://ws.recombee/", className = "recombee.ws.AddPurchase")
    @ResponseWrapper(localName = "addPurchaseResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.AddPurchaseResponse")
    @Action(input = "http://ws.recombee/Recombee/addPurchaseRequest", output = "http://ws.recombee/Recombee/addPurchaseResponse")
    public boolean addPurchase(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "appId", targetNamespace = "")
        long appId);

    /**
     * 
     * @param appId
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deletePurchase", targetNamespace = "http://ws.recombee/", className = "recombee.ws.DeletePurchase")
    @ResponseWrapper(localName = "deletePurchaseResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.DeletePurchaseResponse")
    @Action(input = "http://ws.recombee/Recombee/deletePurchaseRequest", output = "http://ws.recombee/Recombee/deletePurchaseResponse")
    public boolean deletePurchase(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "appId", targetNamespace = "")
        long appId);

    /**
     * 
     * @param user
     * @return
     *     returns java.util.List<game.soap.ws.Game>
     */
    @WebMethod
    @WebResult(name = "games", targetNamespace = "")
    @RequestWrapper(localName = "showPurchases", targetNamespace = "http://ws.recombee/", className = "recombee.ws.ShowPurchases")
    @ResponseWrapper(localName = "showPurchasesResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.ShowPurchasesResponse")
    @Action(input = "http://ws.recombee/Recombee/showPurchasesRequest", output = "http://ws.recombee/Recombee/showPurchasesResponse")
    public List<Game> showPurchases(
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @param appId
     * @param rating
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addRating", targetNamespace = "http://ws.recombee/", className = "recombee.ws.AddRating")
    @ResponseWrapper(localName = "addRatingResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.AddRatingResponse")
    @Action(input = "http://ws.recombee/Recombee/addRatingRequest", output = "http://ws.recombee/Recombee/addRatingResponse")
    public boolean addRating(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "appId", targetNamespace = "")
        long appId,
        @WebParam(name = "rating", targetNamespace = "")
        double rating);

    /**
     * 
     * @param appId
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deleteRating", targetNamespace = "http://ws.recombee/", className = "recombee.ws.DeleteRating")
    @ResponseWrapper(localName = "deleteRatingResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.DeleteRatingResponse")
    @Action(input = "http://ws.recombee/Recombee/deleteRatingRequest", output = "http://ws.recombee/Recombee/deleteRatingResponse")
    public boolean deleteRating(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "appId", targetNamespace = "")
        long appId);

    /**
     * 
     * @param user
     * @return
     *     returns java.util.List<game.soap.ws.Game>
     */
    @WebMethod
    @WebResult(name = "games", targetNamespace = "")
    @RequestWrapper(localName = "showRatings", targetNamespace = "http://ws.recombee/", className = "recombee.ws.ShowRatings")
    @ResponseWrapper(localName = "showRatingsResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.ShowRatingsResponse")
    @Action(input = "http://ws.recombee/Recombee/showRatingsRequest", output = "http://ws.recombee/Recombee/showRatingsResponse")
    public List<Game> showRatings(
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @param appId
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addBookmark", targetNamespace = "http://ws.recombee/", className = "recombee.ws.AddBookmark")
    @ResponseWrapper(localName = "addBookmarkResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.AddBookmarkResponse")
    @Action(input = "http://ws.recombee/Recombee/addBookmarkRequest", output = "http://ws.recombee/Recombee/addBookmarkResponse")
    public boolean addBookmark(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "appId", targetNamespace = "")
        long appId);

    /**
     * 
     * @param appId
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deleteBookmark", targetNamespace = "http://ws.recombee/", className = "recombee.ws.DeleteBookmark")
    @ResponseWrapper(localName = "deleteBookmarkResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.DeleteBookmarkResponse")
    @Action(input = "http://ws.recombee/Recombee/deleteBookmarkRequest", output = "http://ws.recombee/Recombee/deleteBookmarkResponse")
    public boolean deleteBookmark(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "appId", targetNamespace = "")
        long appId);

    /**
     * 
     * @param user
     * @return
     *     returns java.util.List<game.soap.ws.Game>
     */
    @WebMethod
    @WebResult(name = "games", targetNamespace = "")
    @RequestWrapper(localName = "showBookmarks", targetNamespace = "http://ws.recombee/", className = "recombee.ws.ShowBookmarks")
    @ResponseWrapper(localName = "showBookmarksResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.ShowBookmarksResponse")
    @Action(input = "http://ws.recombee/Recombee/showBookmarksRequest", output = "http://ws.recombee/Recombee/showBookmarksResponse")
    public List<Game> showBookmarks(
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @return
     *     returns java.util.List<game.soap.ws.Game>
     */
    @WebMethod
    @WebResult(name = "games", targetNamespace = "")
    @RequestWrapper(localName = "randomGames", targetNamespace = "http://ws.recombee/", className = "recombee.ws.RandomGames")
    @ResponseWrapper(localName = "randomGamesResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.RandomGamesResponse")
    @Action(input = "http://ws.recombee/Recombee/randomGamesRequest", output = "http://ws.recombee/Recombee/randomGamesResponse")
    public List<Game> randomGames();

    /**
     * 
     * @param appId
     * @param name
     * @return
     *     returns game.soap.ws.Game
     */
    @WebMethod
    @WebResult(name = "game", targetNamespace = "")
    @RequestWrapper(localName = "checkSale", targetNamespace = "http://ws.recombee/", className = "recombee.ws.CheckSale")
    @ResponseWrapper(localName = "checkSaleResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.CheckSaleResponse")
    @Action(input = "http://ws.recombee/Recombee/checkSaleRequest", output = "http://ws.recombee/Recombee/checkSaleResponse")
    public Game checkSale(
        @WebParam(name = "appId", targetNamespace = "")
        long appId,
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns java.util.List<game.soap.ws.Game>
     */
    @WebMethod
    @WebResult(name = "games", targetNamespace = "")
    @RequestWrapper(localName = "findGame", targetNamespace = "http://ws.recombee/", className = "recombee.ws.FindGame")
    @ResponseWrapper(localName = "findGameResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.FindGameResponse")
    @Action(input = "http://ws.recombee/Recombee/findGameRequest", output = "http://ws.recombee/Recombee/findGameResponse")
    public List<Game> findGame(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(name = "obcjects", targetNamespace = "")
    @RequestWrapper(localName = "randomUserByItem", targetNamespace = "http://ws.recombee/", className = "recombee.ws.RandomUserByItem")
    @ResponseWrapper(localName = "randomUserByItemResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.RandomUserByItemResponse")
    @Action(input = "http://ws.recombee/Recombee/randomUserByItemRequest", output = "http://ws.recombee/Recombee/randomUserByItemResponse")
    public List<Object> randomUserByItem(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://ws.recombee/", className = "recombee.ws.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://ws.recombee/", className = "recombee.ws.DeleteUserResponse")
    @Action(input = "http://ws.recombee/Recombee/deleteUserRequest", output = "http://ws.recombee/Recombee/deleteUserResponse")
    public boolean deleteUser(
        @WebParam(name = "user", targetNamespace = "")
        String user);

}
