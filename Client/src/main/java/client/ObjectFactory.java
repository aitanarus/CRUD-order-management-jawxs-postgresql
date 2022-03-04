
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _Create_QNAME = new QName("http://service/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://service/", "createResponse");
    private final static QName _Delete_QNAME = new QName("http://service/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://service/", "deleteResponse");
    private final static QName _LoadOrders_QNAME = new QName("http://service/", "loadOrders");
    private final static QName _LoadOrdersResponse_QNAME = new QName("http://service/", "loadOrdersResponse");
    private final static QName _ReadByCharacters_QNAME = new QName("http://service/", "readByCharacters");
    private final static QName _ReadByCharactersResponse_QNAME = new QName("http://service/", "readByCharactersResponse");
    private final static QName _Update_QNAME = new QName("http://service/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://service/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link LoadOrders }
     * 
     */
    public LoadOrders createLoadOrders() {
        return new LoadOrders();
    }

    /**
     * Create an instance of {@link LoadOrdersResponse }
     * 
     */
    public LoadOrdersResponse createLoadOrdersResponse() {
        return new LoadOrdersResponse();
    }

    /**
     * Create an instance of {@link ReadByCharacters }
     * 
     */
    public ReadByCharacters createReadByCharacters() {
        return new ReadByCharacters();
    }

    /**
     * Create an instance of {@link ReadByCharactersResponse }
     * 
     */
    public ReadByCharactersResponse createReadByCharactersResponse() {
        return new ReadByCharactersResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadOrders }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadOrders }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "loadOrders")
    public JAXBElement<LoadOrders> createLoadOrders(LoadOrders value) {
        return new JAXBElement<LoadOrders>(_LoadOrders_QNAME, LoadOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadOrdersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadOrdersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "loadOrdersResponse")
    public JAXBElement<LoadOrdersResponse> createLoadOrdersResponse(LoadOrdersResponse value) {
        return new JAXBElement<LoadOrdersResponse>(_LoadOrdersResponse_QNAME, LoadOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadByCharacters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadByCharacters }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "readByCharacters")
    public JAXBElement<ReadByCharacters> createReadByCharacters(ReadByCharacters value) {
        return new JAXBElement<ReadByCharacters>(_ReadByCharacters_QNAME, ReadByCharacters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadByCharactersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadByCharactersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "readByCharactersResponse")
    public JAXBElement<ReadByCharactersResponse> createReadByCharactersResponse(ReadByCharactersResponse value) {
        return new JAXBElement<ReadByCharactersResponse>(_ReadByCharactersResponse_QNAME, ReadByCharactersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
