
package recombee.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the recombee.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddRating_QNAME = new QName("http://ws.recombee/", "addRating");
    private final static QName _AddPurchase_QNAME = new QName("http://ws.recombee/", "addPurchase");
    private final static QName _ShowBookmarksResponse_QNAME = new QName("http://ws.recombee/", "showBookmarksResponse");
    private final static QName _ShowPurchasesResponse_QNAME = new QName("http://ws.recombee/", "showPurchasesResponse");
    private final static QName _DeleteRating_QNAME = new QName("http://ws.recombee/", "deleteRating");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://ws.recombee/", "registerUserResponse");
    private final static QName _AddBookmark_QNAME = new QName("http://ws.recombee/", "addBookmark");
    private final static QName _GetReccomendation_QNAME = new QName("http://ws.recombee/", "getReccomendation");
    private final static QName _DeletePurchase_QNAME = new QName("http://ws.recombee/", "deletePurchase");
    private final static QName _DeleteRatingResponse_QNAME = new QName("http://ws.recombee/", "deleteRatingResponse");
    private final static QName _RandomUserByItemResponse_QNAME = new QName("http://ws.recombee/", "randomUserByItemResponse");
    private final static QName _CheckSaleResponse_QNAME = new QName("http://ws.recombee/", "checkSaleResponse");
    private final static QName _RandomGames_QNAME = new QName("http://ws.recombee/", "randomGames");
    private final static QName _AddRatingResponse_QNAME = new QName("http://ws.recombee/", "addRatingResponse");
    private final static QName _DeletePurchaseResponse_QNAME = new QName("http://ws.recombee/", "deletePurchaseResponse");
    private final static QName _GetReccomendationByGenreResponse_QNAME = new QName("http://ws.recombee/", "getReccomendationByGenreResponse");
    private final static QName _ShowBookmarks_QNAME = new QName("http://ws.recombee/", "showBookmarks");
    private final static QName _FindGame_QNAME = new QName("http://ws.recombee/", "findGame");
    private final static QName _AddPurchaseResponse_QNAME = new QName("http://ws.recombee/", "addPurchaseResponse");
    private final static QName _FindGameResponse_QNAME = new QName("http://ws.recombee/", "findGameResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://ws.recombee/", "deleteUser");
    private final static QName _RegisterUser_QNAME = new QName("http://ws.recombee/", "registerUser");
    private final static QName _ShowRatings_QNAME = new QName("http://ws.recombee/", "showRatings");
    private final static QName _RandomUserByItem_QNAME = new QName("http://ws.recombee/", "randomUserByItem");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://ws.recombee/", "deleteUserResponse");
    private final static QName _GetReccomendationResponse_QNAME = new QName("http://ws.recombee/", "getReccomendationResponse");
    private final static QName _GetReccomendationByGenre_QNAME = new QName("http://ws.recombee/", "getReccomendationByGenre");
    private final static QName _RandomGamesResponse_QNAME = new QName("http://ws.recombee/", "randomGamesResponse");
    private final static QName _AddBookmarkResponse_QNAME = new QName("http://ws.recombee/", "addBookmarkResponse");
    private final static QName _DeleteBookmark_QNAME = new QName("http://ws.recombee/", "deleteBookmark");
    private final static QName _ShowPurchases_QNAME = new QName("http://ws.recombee/", "showPurchases");
    private final static QName _DeleteBookmarkResponse_QNAME = new QName("http://ws.recombee/", "deleteBookmarkResponse");
    private final static QName _ShowRatingsResponse_QNAME = new QName("http://ws.recombee/", "showRatingsResponse");
    private final static QName _CheckSale_QNAME = new QName("http://ws.recombee/", "checkSale");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: recombee.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBookmark }
     * 
     */
    public AddBookmark createAddBookmark() {
        return new AddBookmark();
    }

    /**
     * Create an instance of {@link GetReccomendation }
     * 
     */
    public GetReccomendation createGetReccomendation() {
        return new GetReccomendation();
    }

    /**
     * Create an instance of {@link DeletePurchase }
     * 
     */
    public DeletePurchase createDeletePurchase() {
        return new DeletePurchase();
    }

    /**
     * Create an instance of {@link DeleteRatingResponse }
     * 
     */
    public DeleteRatingResponse createDeleteRatingResponse() {
        return new DeleteRatingResponse();
    }

    /**
     * Create an instance of {@link RandomUserByItemResponse }
     * 
     */
    public RandomUserByItemResponse createRandomUserByItemResponse() {
        return new RandomUserByItemResponse();
    }

    /**
     * Create an instance of {@link CheckSaleResponse }
     * 
     */
    public CheckSaleResponse createCheckSaleResponse() {
        return new CheckSaleResponse();
    }

    /**
     * Create an instance of {@link RandomGames }
     * 
     */
    public RandomGames createRandomGames() {
        return new RandomGames();
    }

    /**
     * Create an instance of {@link AddRatingResponse }
     * 
     */
    public AddRatingResponse createAddRatingResponse() {
        return new AddRatingResponse();
    }

    /**
     * Create an instance of {@link DeletePurchaseResponse }
     * 
     */
    public DeletePurchaseResponse createDeletePurchaseResponse() {
        return new DeletePurchaseResponse();
    }

    /**
     * Create an instance of {@link GetReccomendationByGenreResponse }
     * 
     */
    public GetReccomendationByGenreResponse createGetReccomendationByGenreResponse() {
        return new GetReccomendationByGenreResponse();
    }

    /**
     * Create an instance of {@link AddRating }
     * 
     */
    public AddRating createAddRating() {
        return new AddRating();
    }

    /**
     * Create an instance of {@link AddPurchase }
     * 
     */
    public AddPurchase createAddPurchase() {
        return new AddPurchase();
    }

    /**
     * Create an instance of {@link ShowBookmarksResponse }
     * 
     */
    public ShowBookmarksResponse createShowBookmarksResponse() {
        return new ShowBookmarksResponse();
    }

    /**
     * Create an instance of {@link ShowPurchasesResponse }
     * 
     */
    public ShowPurchasesResponse createShowPurchasesResponse() {
        return new ShowPurchasesResponse();
    }

    /**
     * Create an instance of {@link DeleteRating }
     * 
     */
    public DeleteRating createDeleteRating() {
        return new DeleteRating();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link GetReccomendationByGenre }
     * 
     */
    public GetReccomendationByGenre createGetReccomendationByGenre() {
        return new GetReccomendationByGenre();
    }

    /**
     * Create an instance of {@link RandomGamesResponse }
     * 
     */
    public RandomGamesResponse createRandomGamesResponse() {
        return new RandomGamesResponse();
    }

    /**
     * Create an instance of {@link AddBookmarkResponse }
     * 
     */
    public AddBookmarkResponse createAddBookmarkResponse() {
        return new AddBookmarkResponse();
    }

    /**
     * Create an instance of {@link DeleteBookmark }
     * 
     */
    public DeleteBookmark createDeleteBookmark() {
        return new DeleteBookmark();
    }

    /**
     * Create an instance of {@link ShowPurchases }
     * 
     */
    public ShowPurchases createShowPurchases() {
        return new ShowPurchases();
    }

    /**
     * Create an instance of {@link DeleteBookmarkResponse }
     * 
     */
    public DeleteBookmarkResponse createDeleteBookmarkResponse() {
        return new DeleteBookmarkResponse();
    }

    /**
     * Create an instance of {@link ShowRatingsResponse }
     * 
     */
    public ShowRatingsResponse createShowRatingsResponse() {
        return new ShowRatingsResponse();
    }

    /**
     * Create an instance of {@link CheckSale }
     * 
     */
    public CheckSale createCheckSale() {
        return new CheckSale();
    }

    /**
     * Create an instance of {@link ShowBookmarks }
     * 
     */
    public ShowBookmarks createShowBookmarks() {
        return new ShowBookmarks();
    }

    /**
     * Create an instance of {@link FindGame }
     * 
     */
    public FindGame createFindGame() {
        return new FindGame();
    }

    /**
     * Create an instance of {@link AddPurchaseResponse }
     * 
     */
    public AddPurchaseResponse createAddPurchaseResponse() {
        return new AddPurchaseResponse();
    }

    /**
     * Create an instance of {@link FindGameResponse }
     * 
     */
    public FindGameResponse createFindGameResponse() {
        return new FindGameResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link ShowRatings }
     * 
     */
    public ShowRatings createShowRatings() {
        return new ShowRatings();
    }

    /**
     * Create an instance of {@link RandomUserByItem }
     * 
     */
    public RandomUserByItem createRandomUserByItem() {
        return new RandomUserByItem();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetReccomendationResponse }
     * 
     */
    public GetReccomendationResponse createGetReccomendationResponse() {
        return new GetReccomendationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "addRating")
    public JAXBElement<AddRating> createAddRating(AddRating value) {
        return new JAXBElement<AddRating>(_AddRating_QNAME, AddRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "addPurchase")
    public JAXBElement<AddPurchase> createAddPurchase(AddPurchase value) {
        return new JAXBElement<AddPurchase>(_AddPurchase_QNAME, AddPurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowBookmarksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "showBookmarksResponse")
    public JAXBElement<ShowBookmarksResponse> createShowBookmarksResponse(ShowBookmarksResponse value) {
        return new JAXBElement<ShowBookmarksResponse>(_ShowBookmarksResponse_QNAME, ShowBookmarksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowPurchasesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "showPurchasesResponse")
    public JAXBElement<ShowPurchasesResponse> createShowPurchasesResponse(ShowPurchasesResponse value) {
        return new JAXBElement<ShowPurchasesResponse>(_ShowPurchasesResponse_QNAME, ShowPurchasesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "deleteRating")
    public JAXBElement<DeleteRating> createDeleteRating(DeleteRating value) {
        return new JAXBElement<DeleteRating>(_DeleteRating_QNAME, DeleteRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookmark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "addBookmark")
    public JAXBElement<AddBookmark> createAddBookmark(AddBookmark value) {
        return new JAXBElement<AddBookmark>(_AddBookmark_QNAME, AddBookmark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReccomendation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "getReccomendation")
    public JAXBElement<GetReccomendation> createGetReccomendation(GetReccomendation value) {
        return new JAXBElement<GetReccomendation>(_GetReccomendation_QNAME, GetReccomendation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "deletePurchase")
    public JAXBElement<DeletePurchase> createDeletePurchase(DeletePurchase value) {
        return new JAXBElement<DeletePurchase>(_DeletePurchase_QNAME, DeletePurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "deleteRatingResponse")
    public JAXBElement<DeleteRatingResponse> createDeleteRatingResponse(DeleteRatingResponse value) {
        return new JAXBElement<DeleteRatingResponse>(_DeleteRatingResponse_QNAME, DeleteRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomUserByItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "randomUserByItemResponse")
    public JAXBElement<RandomUserByItemResponse> createRandomUserByItemResponse(RandomUserByItemResponse value) {
        return new JAXBElement<RandomUserByItemResponse>(_RandomUserByItemResponse_QNAME, RandomUserByItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "checkSaleResponse")
    public JAXBElement<CheckSaleResponse> createCheckSaleResponse(CheckSaleResponse value) {
        return new JAXBElement<CheckSaleResponse>(_CheckSaleResponse_QNAME, CheckSaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomGames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "randomGames")
    public JAXBElement<RandomGames> createRandomGames(RandomGames value) {
        return new JAXBElement<RandomGames>(_RandomGames_QNAME, RandomGames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "addRatingResponse")
    public JAXBElement<AddRatingResponse> createAddRatingResponse(AddRatingResponse value) {
        return new JAXBElement<AddRatingResponse>(_AddRatingResponse_QNAME, AddRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "deletePurchaseResponse")
    public JAXBElement<DeletePurchaseResponse> createDeletePurchaseResponse(DeletePurchaseResponse value) {
        return new JAXBElement<DeletePurchaseResponse>(_DeletePurchaseResponse_QNAME, DeletePurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReccomendationByGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "getReccomendationByGenreResponse")
    public JAXBElement<GetReccomendationByGenreResponse> createGetReccomendationByGenreResponse(GetReccomendationByGenreResponse value) {
        return new JAXBElement<GetReccomendationByGenreResponse>(_GetReccomendationByGenreResponse_QNAME, GetReccomendationByGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowBookmarks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "showBookmarks")
    public JAXBElement<ShowBookmarks> createShowBookmarks(ShowBookmarks value) {
        return new JAXBElement<ShowBookmarks>(_ShowBookmarks_QNAME, ShowBookmarks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindGame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "findGame")
    public JAXBElement<FindGame> createFindGame(FindGame value) {
        return new JAXBElement<FindGame>(_FindGame_QNAME, FindGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "addPurchaseResponse")
    public JAXBElement<AddPurchaseResponse> createAddPurchaseResponse(AddPurchaseResponse value) {
        return new JAXBElement<AddPurchaseResponse>(_AddPurchaseResponse_QNAME, AddPurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindGameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "findGameResponse")
    public JAXBElement<FindGameResponse> createFindGameResponse(FindGameResponse value) {
        return new JAXBElement<FindGameResponse>(_FindGameResponse_QNAME, FindGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowRatings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "showRatings")
    public JAXBElement<ShowRatings> createShowRatings(ShowRatings value) {
        return new JAXBElement<ShowRatings>(_ShowRatings_QNAME, ShowRatings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomUserByItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "randomUserByItem")
    public JAXBElement<RandomUserByItem> createRandomUserByItem(RandomUserByItem value) {
        return new JAXBElement<RandomUserByItem>(_RandomUserByItem_QNAME, RandomUserByItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReccomendationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "getReccomendationResponse")
    public JAXBElement<GetReccomendationResponse> createGetReccomendationResponse(GetReccomendationResponse value) {
        return new JAXBElement<GetReccomendationResponse>(_GetReccomendationResponse_QNAME, GetReccomendationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReccomendationByGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "getReccomendationByGenre")
    public JAXBElement<GetReccomendationByGenre> createGetReccomendationByGenre(GetReccomendationByGenre value) {
        return new JAXBElement<GetReccomendationByGenre>(_GetReccomendationByGenre_QNAME, GetReccomendationByGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomGamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "randomGamesResponse")
    public JAXBElement<RandomGamesResponse> createRandomGamesResponse(RandomGamesResponse value) {
        return new JAXBElement<RandomGamesResponse>(_RandomGamesResponse_QNAME, RandomGamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookmarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "addBookmarkResponse")
    public JAXBElement<AddBookmarkResponse> createAddBookmarkResponse(AddBookmarkResponse value) {
        return new JAXBElement<AddBookmarkResponse>(_AddBookmarkResponse_QNAME, AddBookmarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookmark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "deleteBookmark")
    public JAXBElement<DeleteBookmark> createDeleteBookmark(DeleteBookmark value) {
        return new JAXBElement<DeleteBookmark>(_DeleteBookmark_QNAME, DeleteBookmark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowPurchases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "showPurchases")
    public JAXBElement<ShowPurchases> createShowPurchases(ShowPurchases value) {
        return new JAXBElement<ShowPurchases>(_ShowPurchases_QNAME, ShowPurchases.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookmarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "deleteBookmarkResponse")
    public JAXBElement<DeleteBookmarkResponse> createDeleteBookmarkResponse(DeleteBookmarkResponse value) {
        return new JAXBElement<DeleteBookmarkResponse>(_DeleteBookmarkResponse_QNAME, DeleteBookmarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowRatingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "showRatingsResponse")
    public JAXBElement<ShowRatingsResponse> createShowRatingsResponse(ShowRatingsResponse value) {
        return new JAXBElement<ShowRatingsResponse>(_ShowRatingsResponse_QNAME, ShowRatingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.recombee/", name = "checkSale")
    public JAXBElement<CheckSale> createCheckSale(CheckSale value) {
        return new JAXBElement<CheckSale>(_CheckSale_QNAME, CheckSale.class, null, value);
    }

}
